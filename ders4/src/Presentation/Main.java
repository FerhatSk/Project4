package Presentation;

import Entity.ProgrammingLanguage;
import Repository.ProgrammingLanguageRepository;

public class Main {

    public static void main(String[] args) {

        ProgrammingLanguage programmingLanguage=new ProgrammingLanguage(10,"java");
        ProgrammingLanguage programmingLanguage2=new ProgrammingLanguage(10,"pyton");

        ProgrammingLanguageRepository language=new ProgrammingLanguageRepository();

        language.add(programmingLanguage);

        language.update(programmingLanguage2);

        language.delete(programmingLanguage2);



    }
}