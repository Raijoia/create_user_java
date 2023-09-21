public class User {
  private String name;
  private String email;
  private String age;

  public User(String name, String email, String age){
    this.name = name;
    this.email = email;
    this.age = age;
  }

  public String exibirName(){
    return("Olá " + name + ", Ben-vindo ao meu Software");
  }

  public String exibirEmail(){
    return("O email do/a " + name + " é " + email);
  }

  public String exibirAge(){
    return("A idade do/a " + name + " é " + age);
  }
}