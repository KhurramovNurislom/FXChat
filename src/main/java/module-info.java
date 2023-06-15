module com.example.fxchat {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.fxchat to javafx.fxml;
    exports com.example.fxchat;
    exports com.example.fxchat.controllers;
    opens com.example.fxchat.controllers to javafx.fxml;
}