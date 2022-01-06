module nyx.view {
    requires javafx.controls;
    requires javafx.fxml;

    opens pl.pkrysztofiak.nyx.view to javafx.fxml;

    exports pl.pkrysztofiak.nyx.view;
}