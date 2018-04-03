package ru.levelup.Lesson09.repositiry;

import ru.levelup.Lesson09.domain.Country;

public interface CountryRepository {

    Country create(String name, String capital, double population);


}
