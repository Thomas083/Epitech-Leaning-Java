import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Inspector<T> {
    private Class<T> inspectedClass;
    

    public Inspector(Class<T> inspectedClass) {
        this.inspectedClass = (Class<T>) inspectedClass;
    }

    @Test(name = "testGetClass")
    public void displayInformations() {
        System.out.println("Information of the \""+inspectedClass.getName()+"\" class:");
        System.out.println("Superclass: "+inspectedClass.getSuperclass().getName());
        System.out.println(inspectedClass.getDeclaredMethods().length+" methods:");
        for (Method method : inspectedClass.getDeclaredMethods()) {
            System.out.println("- "+method.getName());
        }
        System.out.println(inspectedClass.getDeclaredFields().length+" fields:");
        for (Field field : inspectedClass.getDeclaredFields()) {
            System.out.println("- "+field.getName());
        }
    }

    @Test(name = "testGetSuperClass")
    public T createInstance() throws Exception {
        try {
            return inspectedClass.getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}