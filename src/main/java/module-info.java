module com.example.fxchat {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.fxchat to javafx.fxml;
    exports com.example.fxchat;
}