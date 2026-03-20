package pack2;

public class Captain {
    // captain  >  id / name / active
    private int idCaptain;
    private String nameCaptain;
    private boolean activeCaptain;

    public int getIdCaptain() {
        return idCaptain;
    }

    public String getNameCaptain() {
        return nameCaptain;
    }

    public void setIdCaptain(int idCaptain) {
        if (idCaptain >0){
            this.idCaptain = idCaptain;
        }
        else {
            System.out.println(" -> Invalid ID Captain.");
        }
    }

    public void setNameCaptain(String nameCaptain) {
        if (nameCaptain!=null && nameCaptain.length()>=3 && nameCaptain.matches("[A-Za-z ]+")){
            this.nameCaptain = nameCaptain;
        }
        else {
            System.out.println(" -> Invalid Name Captain.");
        }
    }

    public void setActiveCaptain(boolean activeCaptain) {
        this.activeCaptain = activeCaptain;
    }
    public void printCaptainInfo(){
        System.out.println(" Captain Info : ");
        System.out.println(" - ID Captain : " + idCaptain);
        System.out.println(" - Name Captain : " + nameCaptain);
        System.out.println(" - Active Captain : " + activeCaptain);
        System.out.println(" ---------------------------------------------------------- ");
    }
}
