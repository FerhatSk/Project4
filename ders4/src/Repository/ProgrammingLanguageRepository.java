package Repository;

import Entity.ProgrammingLanguage;
import java.util.List;
import java.util.ArrayList;

public class ProgrammingLanguageRepository {

    private List<ProgrammingLanguage> languages = new ArrayList<>();

    public void add(ProgrammingLanguage entity){
        languages.add(entity);
    }

    public List<ProgrammingLanguage> getAll(){
        return languages;
    }

    public void delete(ProgrammingLanguage entity){
        languages.remove(entity);
    }

    public void update(ProgrammingLanguage newlanguage){

        for(ProgrammingLanguage eleman:languages){
            if(eleman.getId()==newlanguage.getId()){
                eleman.setName(newlanguage.getName());
            }
        }
    }





}
