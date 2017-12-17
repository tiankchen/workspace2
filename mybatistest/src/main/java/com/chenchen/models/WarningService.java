package com.chenchen.models;

public interface WarningService<E> {

    public Alert GetAlert(String id);

    public boolean GetAlert(Alert alert, String id);
}

class Alert{

}
