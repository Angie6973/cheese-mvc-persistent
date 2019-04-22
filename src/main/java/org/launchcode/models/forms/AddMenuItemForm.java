package org.launchcode.models.forms;

import javax.validation.constraints.NotNull;

public class AddMenuItemForm {

    @NotNull
    private int menuId;

    @NotNull
    private int cheeseId;

    private Iterable<Cheese> cheeses;

    private Menu menu;

    public AddMenuItemForm(){}

    public AddMenuItemForm(Iterable<Cheese> cheeses, Menu menu) {
        this.cheeses = cheeses;
        this.menu = menu;
    }
    public int getMenuId() {return menuId;}
    public void setMenuId(int menuId) {this.menuId= menuId;}
    public int getCheeseId() {return cheeseId;}



    }

