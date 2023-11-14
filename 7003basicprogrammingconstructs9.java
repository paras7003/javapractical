class checkjava {
        public static void main(String[] a) {
            System.out.println("Checking that java is installed in this system or not.....");
            String javaVersion = System.getProperty("java.version");
            if (javaVersion != null) {
                System.out.println("Java Version: " + javaVersion);
                System.out.println("Java is installed in this system.");
            } else {
                System.out.println("Java is not installed in this system.");
            }
        }
    
}
