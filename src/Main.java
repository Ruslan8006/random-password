public class Main {
    public static void main(String[] arg){
        RandomPassword rp =new RandomPassword("sfdsjdf", "sdfsdfsd", 8);
        rp.setPassword();

    }
}
class RandomPassword {
    private String serviceName;
    private String serviceLoginEmail;
    int quantitySymbol;
    private StringBuilder password = new StringBuilder();

    public RandomPassword(String serviceName, String serviceLoginEmail, int quantitySymbol) {
        this.serviceName = serviceName;
        this.serviceLoginEmail = serviceLoginEmail;
        this.quantitySymbol = quantitySymbol;
    }

    public void setPassword() {
        for(int i=0; i<=this.quantitySymbol-1; i++){
            int n1=(int) (Math.random() * 10);
            char numeric=(char) (n1+'0');
            char LITER= (char) (65+((int) (Math.random() *25)));
            char liter=(char) (97+((int) (Math.random() *25)));
            char[] list ={liter, numeric, liter, liter, LITER, LITER};
            int randomElement= (int) (Math.random()*(list.length));
            password.append(list[randomElement]);
        }
        System.out.println("ваш пароль для сервиса "+ serviceName+"= "+password);

    }
}

