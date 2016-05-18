package sample.vaadin_components;

import javax.servlet.annotation.WebServlet;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.annotations.Widgetset;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.ComboBox;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.TabSheet;
import com.vaadin.ui.Table;
import com.vaadin.ui.TextField;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.Window;

/**
 * This UI is the application entry point. A UI may either represent a browser window 
 * (or tab) or some part of a html page where a Vaadin application is embedded.
 * <p>
 * The UI is initialized using {@link #init(VaadinRequest)}. This method is intended to be 
 * overridden to add component to the user interface and initialize non-component functionality.
 */
@Theme("mytheme")
@Widgetset("sample.vaadin_components.MyAppWidgetset")
public class MyUI extends UI {

    @Override
    protected void init(VaadinRequest vaadinRequest) {
        final VerticalLayout layout = new VerticalLayout();
        
        TabSheet tabSheet = new TabSheet();
        tabSheet.addTab(verticalLayoutTab(), "Vertical Layout");
        tabSheet.addTab(horizontalLayoutTab(), "Horizontal Layout");
        tabSheet.addTab(combinationLayoutTab(), "Combination of Vertical & Horizontal Layouts");
        
        layout.setMargin(true);
        layout.addComponent(tabSheet);

        setContent(layout);
    }
    
    public VerticalLayout verticalLayoutTab() {
    	
    	VerticalLayout layout = new VerticalLayout();
    	
    	Label label = new Label("Label");
        
        TextField textField = new TextField("TextField");
        
        ComboBox comboBox = new ComboBox("ComboBox");
        comboBox.addItem("item1");
        comboBox.addItem("item2");
        
 
        
        Table table = new Table("Table");
        table.addContainerProperty("Label", Label.class, null);
        table.addContainerProperty("Button", Button.class, null);
        
        table.setColumnWidth("Label", 100);
        table.setColumnWidth("Button", 120);
        
        table.addItem(new Object [] {
        	new Label("Label1"), new Button("Button1")
        },
        0);
        
        table.addItem(new Object [] {
            	new Label("Label2"), new Button("Button2")
            },
            1);
        
        table.addItem(new Object [] {
            	new Label("Label3"), new Button("Button3")
            },
            2);
        
        table.setHeight("200px");
        
        Button button = new Button("Button");
        button.addClickListener(event -> {
        	
        	Window window = new Window("Window");
        	window.setHeight("1000px");
        	window.setWidth("600px");
        	window.setPosition(350, 0);
        	
        	VerticalLayout content = new VerticalLayout();
        	content.setMargin(true);
        	content.addComponent(new Label("VerticalLayout layout = new VerticalLayout();"));
        	content.addComponent(new Label(" "));
        	content.addComponent(new Label("Label label = new Label(\"Label\");"));
        	content.addComponent(new Label(" "));
        	content.addComponent(new Label("TextField textField = new TextField(\"TextField\");"));
        	content.addComponent(new Label(" "));
        	content.addComponent(new Label("ComboBox comboBox = new ComboBox(\"ComboBox\");"));
        	content.addComponent(new Label("comboBox.addItem(\"item1\");"));
        	content.addComponent(new Label("comboBox.addItem(\"item2\");"));
        	content.addComponent(new Label(" "));
        	content.addComponent(new Label("Table table = new Table(\"Table\");"));
        	content.addComponent(new Label("table.addContainerProperty(\"Label\", Label.class, null);"));
        	content.addComponent(new Label("table.addContainerProperty(\"Button\", Button.class, null);"));
        	content.addComponent(new Label(" "));
        	content.addComponent(new Label("table.addItem(new Object [] { new Label(\"Label1\"), "
        			+ "new Button(\"Button1\") }, 0);"));
        	content.addComponent(new Label(" . . . "));
        	content.addComponent(new Label("Button button = new Button(\"Button\");"));
        	content.addComponent(new Label("button.addClickListener(event -> {"));
        	content.addComponent(new Label(" . . . "));
        	content.addComponent(new Label("});"));
        	content.addComponent(new Label(" "));
        	content.addComponent(new Label("layout.addComponent(label);"));
        	content.addComponent(new Label("layout.addComponent(textField);"));
        	content.addComponent(new Label("layout.addComponent(comboBox);"));
        	content.addComponent(new Label("layout.addComponent(table);"));
        	content.addComponent(new Label("layout.addComponent(button);"));
        	
        	window.setContent(content);
        	
        	addWindow(window);
        	
        });
        
        layout.setSpacing(true);
        layout.setMargin(true);
        layout.addComponent(label);
        layout.addComponent(textField);
        layout.addComponent(comboBox);
        layout.addComponent(table);
        layout.addComponent(button);
        
        return layout;
    	
    }
    
    public HorizontalLayout horizontalLayoutTab() {
    	
    	HorizontalLayout layout = new HorizontalLayout();
    	
    	Label label = new Label("Label");
        
        TextField textField = new TextField("TextField");
        
        ComboBox comboBox = new ComboBox("ComboBox");
        comboBox.addItem("item1");
        comboBox.addItem("item2");
        
 
        
        Table table = new Table("Table");
        table.addContainerProperty("Label", Label.class, null);
        table.addContainerProperty("Button", Button.class, null);
        
        table.setColumnWidth("Label", 100);
        table.setColumnWidth("Button", 120);
        
        table.addItem(new Object [] {
        	new Label("Label1"), new Button("Button1")
        },
        0);
        
        table.addItem(new Object [] {
            	new Label("Label2"), new Button("Button2")
            },
            1);
        
        table.addItem(new Object [] {
            	new Label("Label3"), new Button("Button3")
            },
            2);
        
        table.setHeight("200px");
        
        Button button = new Button("Button");
        button.addClickListener(event -> {
        	
        	Window window = new Window("Window");
        	window.setHeight("1000px");
        	window.setWidth("600px");
        	window.setPosition(350, 0);
        	
        	VerticalLayout content = new VerticalLayout();
        	content.setMargin(true);
        	content.addComponent(new Label("HorizontalLayout layout = new HorizontalLayout();"));
        	content.addComponent(new Label(" "));
        	content.addComponent(new Label("Label label = new Label(\"Label\");"));
        	content.addComponent(new Label(" "));
        	content.addComponent(new Label("TextField textField = new TextField(\"TextField\");"));
        	content.addComponent(new Label(" "));
        	content.addComponent(new Label("ComboBox comboBox = new ComboBox(\"ComboBox\");"));
        	content.addComponent(new Label("comboBox.addItem(\"item1\");"));
        	content.addComponent(new Label("comboBox.addItem(\"item2\");"));
        	content.addComponent(new Label(" "));
        	content.addComponent(new Label("Table table = new Table(\"Table\");"));
        	content.addComponent(new Label("table.addContainerProperty(\"Label\", Label.class, null);"));
        	content.addComponent(new Label("table.addContainerProperty(\"Button\", Button.class, null);"));
        	content.addComponent(new Label(" "));
        	content.addComponent(new Label("table.addItem(new Object [] { new Label(\"Label1\"), "
        			+ "new Button(\"Button1\") }, 0);"));
        	content.addComponent(new Label(" . . . "));
        	content.addComponent(new Label("Button button = new Button(\"Button\");"));
        	content.addComponent(new Label("button.addClickListener(event -> {"));
        	content.addComponent(new Label(" . . . "));
        	content.addComponent(new Label("});"));
        	content.addComponent(new Label(" "));
        	content.addComponent(new Label("layout.addComponent(label);"));
        	content.addComponent(new Label("layout.addComponent(textField);"));
        	content.addComponent(new Label("layout.addComponent(comboBox);"));
        	content.addComponent(new Label("layout.addComponent(table);"));
        	content.addComponent(new Label("layout.addComponent(button);"));
        	
        	window.setContent(content);
        	
        	addWindow(window);
        	
        });
        
        layout.setSpacing(true);
        layout.setMargin(true);
        layout.addComponent(label);
        layout.addComponent(textField);
        layout.addComponent(comboBox);
        layout.addComponent(table);
        layout.addComponent(button);
        layout.setComponentAlignment(button, Alignment.BOTTOM_CENTER);
        
        return layout;
    	
    }
    
    public VerticalLayout combinationLayoutTab() {
    	
    	VerticalLayout layout = new VerticalLayout();
    	
    	Label verticalLayoutLabel = new Label("VerticalLayout");
    	
    	HorizontalLayout horizontalLayout1 = new HorizontalLayout();
    	
    	Label horizontalLayoutLabel1 = new Label("HorizontalLayout1: ");
    	
    	horizontalLayout1.setMargin(true);
    	horizontalLayout1.setSpacing(true);
    	horizontalLayout1.addComponent(horizontalLayoutLabel1);
    	horizontalLayout1.addComponent(new TextField("TextField"));
    	horizontalLayout1.addComponent(new ComboBox("ComboBox"));
    	
    	HorizontalLayout horizontalLayout2 = new HorizontalLayout();
    	
    	Label horizontalLayoutLabel2 = new Label("HorizontalLayout2: ");
    	
    	horizontalLayout2.setMargin(true);
    	horizontalLayout2.setSpacing(true);
    	horizontalLayout2.addComponent(horizontalLayoutLabel2);
    	horizontalLayout2.addComponent(new TextField("TextField"));
    	horizontalLayout2.addComponent(new ComboBox("ComboBox"));
    	
    	layout.setMargin(true);
    	layout.addComponent(verticalLayoutLabel);
    	layout.addComponent(horizontalLayout1);
    	layout.addComponent(horizontalLayout2);
    	layout.addComponent(new Button("Button"));
    	
    	return layout;
    	
    }

    @WebServlet(urlPatterns = "/*", name = "MyUIServlet", asyncSupported = true)
    @VaadinServletConfiguration(ui = MyUI.class, productionMode = false)
    public static class MyUIServlet extends VaadinServlet {
    }
}
