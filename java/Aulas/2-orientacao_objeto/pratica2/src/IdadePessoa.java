public class IdadePessoa {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String verificaIdade() {
        if (age > 18) {
            return "Ele(a) é maior de idade";
        } else {
        return "Ele(a) é menor de idade";
        }
    }
}
