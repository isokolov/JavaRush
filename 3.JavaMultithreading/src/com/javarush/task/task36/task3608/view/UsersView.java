package com.javarush.task.task36.task3608.view;

import com.javarush.task.task36.task3608.bean.User;
import com.javarush.task.task36.task3608.controller.Controller;
import com.javarush.task.task36.task3608.model.ModelData;

import java.util.ArrayList;
import java.util.List;

public class UsersView implements View {

    private Controller controller;



    @Override
    public void refresh(ModelData modelData) {
        System.out.println("All users:");
        ArrayList<User> usersList = (ArrayList)modelData.getUsers();
        for(User user: usersList) {
            System.out.println("\tUser{name='" + user.getName() + "', id=" + user.getId() + ", level=" + user.getLevel() + "}");
        }
        System.out.println("===================================================");
    }

    @Override
    public void setController(Controller controller) {
        this.controller = controller;
    }

    public void fireEventShowAllUsers() {
        //controller.setUsersView(this);
        controller.onShowAllUsers();
    }

    public void fireEventShowDeletedUsers() {
        controller.onShowAllDeletedUsers();
    }
}
