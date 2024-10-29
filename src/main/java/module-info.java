module edu.miracosta.cs112.lab08loteria_eventhandling {
    requires javafx.controls;
    requires javafx.fxml;


    opens edu.miracosta.cs112.lab08loteria_eventhandling to javafx.fxml;
    exports edu.miracosta.cs112.lab08loteria_eventhandling;
}