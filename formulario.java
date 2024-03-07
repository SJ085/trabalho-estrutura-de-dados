import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class CadastroBuscaClientes extends Application {
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Cadastro e Busca de Clientes");

        // Layout principal
        VBox root = new VBox(10);
        root.setPadding(new Insets(10));

        // Painel de cadastro
        VBox cadastroBox = new VBox(5);
        cadastroBox.setStyle("-fx-border-color: black; -fx-border-width: 1px; -fx-padding: 10px;");
        cadastroBox.getChildren().addAll(new Label("Cadastro de Cliente"),
                new Label("Nome:"), new TextField(),
                new Label("CPF:"), new TextField(),
                new Label("Email:"), new TextField(),
                new Label("Telefone:"), new TextField(),
                new Button("Cadastrar"));
        root.getChildren().add(cadastroBox);

        // Painel de busca
        VBox buscaBox = new VBox(5);
        buscaBox.setStyle("-fx-border-color: black; -fx-border-width: 1px; -fx-padding: 10px;");
        buscaBox.getChildren().addAll(new Label("Buscar Cliente"),
                new Label("Buscar por CPF:"), new TextField(),
                new Button("Buscar"));
        root.getChildren().add(buscaBox);

        Scene scene = new Scene(root, 400, 300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}