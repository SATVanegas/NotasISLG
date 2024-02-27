module com.pratice.notas {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens com.pratice.notas to javafx.fxml;
    exports com.pratice.notas;
}