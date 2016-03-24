/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package no.uib.probe.mnpc_2017.view;

import com.vaadin.event.LayoutEvents;
import com.vaadin.shared.ui.MarginInfo;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.Panel;
import com.vaadin.ui.PopupView;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

/**
 *
 * @author yfa041
 */
public class ApplicationLayout extends VerticalLayout {

    public ApplicationLayout() {
        this.setWidth("100%");
        this.setHeightUndefined();
//        this.setStyleName(Reindeer.LAYOUT_WHITE);
        this.setMargin(false);
        this.setSpacing(true);

        VerticalLayout headerLayout = new VerticalLayout();
        headerLayout.setWidth("100%");
        headerLayout.setHeight("77px");
        this.addComponent(headerLayout);
        
        
        Panel mainBodyPanel = new Panel();
//        headerLayout.setStyleName(Reindeer.LAYOUT_BLUE);

        HorizontalLayout topLayoutContainer = new HorizontalLayout();
        headerLayout.addComponent(topLayoutContainer);
        headerLayout.setComponentAlignment(topLayoutContainer, Alignment.MIDDLE_CENTER);
        topLayoutContainer.setWidthUndefined();
        topLayoutContainer.setHeight("100%");

        VerticalLayout logoLayout = new VerticalLayout();
        logoLayout.setWidth("200px");
        logoLayout.setHeight("100%");
        logoLayout.setStyleName("starlogo");
        logoLayout.setMargin(new MarginInfo(false, true, false, false));

        Label title = new Label("NPC 2017");
        logoLayout.addComponent(title);

        topLayoutContainer.addComponent(logoLayout);
        topLayoutContainer.setComponentAlignment(logoLayout, Alignment.MIDDLE_RIGHT);

        HorizontalLayout mainMenuContainer = new HorizontalLayout();
        mainMenuContainer.setWidth("780px");
        topLayoutContainer.addComponent(mainMenuContainer);
        topLayoutContainer.setComponentAlignment(mainMenuContainer, Alignment.MIDDLE_RIGHT);
        
        VerticalLayout layoutI = new VerticalLayout();
        mainMenuContainer.addComponent(generateMenuBtn("Home", layoutI));
        
         VerticalLayout layoutII = new VerticalLayout();
        mainMenuContainer.addComponent(generateMenuBtn("Programme", layoutII));
        
         VerticalLayout layoutIII = new VerticalLayout();
        mainMenuContainer.addComponent(generateMenuBtn("Practical Information", layoutIII));
        
         VerticalLayout layoutIV = new VerticalLayout();
        mainMenuContainer.addComponent(generateMenuBtn("Exhibition & Sponsorship", layoutIV));
        
         VerticalLayout layoutV = new VerticalLayout();
        mainMenuContainer.addComponent(generateMenuBtn("Registration", layoutV));
        
        
         VerticalLayout layoutVI = new VerticalLayout();
        mainMenuContainer.addComponent(generateMenuBtn("Contact", layoutVI));
        
        
        

    }
    
    
    
    
    private VerticalLayout generateMenuBtn(String title, VerticalLayout targetComponent){
    
    VerticalLayout btn = new VerticalLayout();
    Label btnLabel = new Label(title);
    btn.setStyleName("menubtn");
    btn.addComponent(btnLabel);
    btn.addLayoutClickListener((LayoutEvents.LayoutClickEvent event) -> {
        UI.getCurrent().scrollIntoView(targetComponent);
    });
    
    
    return btn;
    
    
    }

}
