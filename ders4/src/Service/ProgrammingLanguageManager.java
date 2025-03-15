package Service;

import Entity.ProgrammingLanguage;
import java.util.ArrayList;
import java.util.List;

public class ProgrammingLanguageManager implements ProgrammingLanguageService{

    private List<ProgrammingLanguage> languages = new ArrayList<>();


    @Override
    public void add(ProgrammingLanguage entity) {
        languages.add(entity);
    }


    @Override
    public void delete(ProgrammingLanguage entity) {
        languages.remove(entity);
    }

    @Override
    public void update(ProgrammingLanguage newlanguage) {

        for(ProgrammingLanguage eleman:languages){
            if(eleman.getId()==newlanguage.getId()){
                eleman.setName(newlanguage.getName());
            }
        }

    }
}
