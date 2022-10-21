public class Autor {
    private String nomeAutor;
    private String emailAutor;
    private String cpfAutor;

    public Autor() {
    
    }

    public Autor(String nomeAutor, String emailAutor, String cpfAutor) {
        this.nomeAutor = nomeAutor;
        this.emailAutor = emailAutor;
        this.cpfAutor = cpfAutor;
    }
    public String getNomeAutor() {
        return nomeAutor;
    }
    public void setNomeAutor(String nomeAutor) {
        this.nomeAutor = nomeAutor;
    }
    public String getEmailAutor() {
        return emailAutor;
    }
    public void setEmailAutor(String emailAutor) {
        this.emailAutor = emailAutor;
    }
    public String getCpfAutor() {
        return cpfAutor;
    }
    public void setCpfAutor(String cpfAutor) {
        this.cpfAutor = cpfAutor;
    }

    
}
