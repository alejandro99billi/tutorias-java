package dto;

import interfaces.ExtendedPerson;

public class Admin extends BasePerson implements ExtendedPerson {
    @Override
    public String getRole() {
        return null;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public int getAge() {
        return 0;
    }


}
