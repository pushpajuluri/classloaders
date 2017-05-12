package classloaders;

public class MainClass {
	 public static void main(String[] args) throws InstantiationException, IllegalAccessException{

		    ClassLoader classLoader = MainClass.class.getClassLoader();

		    try {
		        Class aClass = classLoader.loadClass("classloaders.Subclass");
		        System.out.println("aClass.getName() = " + aClass.getName());
		        Object sample=aClass.newInstance();
		        ((Subclass)sample).load();
		        		    } catch (ClassNotFoundException e) {
		        e.printStackTrace();
		    }
}
}
