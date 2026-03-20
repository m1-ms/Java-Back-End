package pack1;

public class Player {
    // player   >  id / name / number

    private int idPlayer;
    private String namePlayer;
    private String numberPlayer;

    public int getIdPlayer() {
        return idPlayer;
    }

    public String getNamePlayer() {
        return namePlayer;
    }

    public String getNumberPlayer() {
        return numberPlayer;
    }

    public void setIdPlayer(int idPlayer) {
        if (idPlayer>0){
            this.idPlayer = idPlayer;
        }
        else {
            System.out.println(" -> Invalid ID Player.");
        }
    }

    public void setNamePlayer(String namePlayer) {
        if (namePlayer != null && namePlayer.length()>=3 && namePlayer.matches("[A-Za-z ]+")){
            this.namePlayer = namePlayer;
        }
        else {
            System.out.println(" -> Invalid Name Player.");
        }
    }

    public void setNumberPlayer(String numberPlayer) {
        if (numberPlayer!=null && numberPlayer.length()>5 && numberPlayer.startsWith("+")) {
            this.numberPlayer = numberPlayer;
        }
        else {
            System.out.println(" - Invalid Number Phone Player.");
        }
    }
    public void printPlayerInfo(){
        System.out.println(" Player Info : ");
        System.out.println(" - ID Player : " + idPlayer);
        System.out.println(" - Name Player : " + namePlayer);
        System.out.println(" - Phone Number Player : " + numberPlayer);
        System.out.println(" -------------------------------------------------------- ");
    }
}
