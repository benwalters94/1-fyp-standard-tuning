module com.standardtuning.standardtuning {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;
    requires java.desktop;

    opens com.standardtuning.standardtuning to javafx.fxml;
    exports com.standardtuning.standardtuning;
}