

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class MainProxy {
    public static void main(String[] args) throws  Exception {
        Employee employee = new Employee("John");
        Object proxyObject = getProxy(employee);
        ((Financier) proxyObject).analyze();
        ((Accountant) proxyObject).accounting(200,100);
        Accountant proxy = (Accountant) Proxy.newProxyInstance(MainProxy.class.getClassLoader(),
                new Class[]{Accountant.class}, new InvocationHandler() {
                    @Override
                    public Object invoke(Object object, Method method, Object[] objects) throws Throwable {
                        Object result = (int)objects[0] + (int)objects[1];
                        System.out.println(result);
                        return null;
                    }
                });
        proxy.accounting(500,200);
    }
    public static Object getProxy(Object obj) throws ClassNotFoundException {
        Class[] interfaces = obj.getClass().getInterfaces();
        return Proxy.newProxyInstance(MainProxy.class.getClassLoader(), interfaces, new InvocationHandler(){
            @Override
            public Object invoke(Object proxy, Method method, Object[] args){

                System.out.println(method.getName() + " was called");
                return null;
            }
        });

    }
}

interface Financier {
    void analyze ();
}

interface Accountant {
    int accounting (int dt, int kt);
}

class Employee implements Financier, Accountant{
    private String name;
    public Employee(String name){
        this.name = name;
    }
    @Override
    public void analyze(){
    }
    @Override
    public int accounting(int dt, int kt){
        return dt - kt;
    }
}

