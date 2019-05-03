import java.util.*;

public class Agenda {
    private final String nombreAgenda;
    Map<Contact,List<ItemInformation>> contactList = new TreeMap<>();

    public Agenda(String nombreAgenda) {
        this.nombreAgenda = nombreAgenda;
        contactList = null;
    }


    public void addContact (Contact c){

    }

    public void addItem (Contact c, ItemInformation i){

    }

    public void addItems (Contact c, List<ItemInformation> li){

    }

    public List<ItemInformation> getItems (Contact c){
        return  null;
    }

    public List<Contact> searchInfo (Contact c){

        return null;
    }

    public void listAll(){

    }

}
