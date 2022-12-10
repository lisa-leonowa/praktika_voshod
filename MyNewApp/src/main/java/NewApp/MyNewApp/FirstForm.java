package NewApp.MyNewApp;

//import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import java.io.BufferedReader;
import java.io.InputStreamReader;
// Подключение библиотек для http запросов
import java.net.*;
// Подключение библиотеки для конвертирование в Base64
import java.util.*;
// Подключение библиотеки для обработки json файлов
import com.google.gson.Gson;


public class FirstForm implements Initializable{
	@FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label label_info;

    @FXML
    private TextField login;

    @FXML
    private PasswordField password;

    @FXML
    private Button sign;

    //Нажатие на кнопку войти
    @FXML
    void sign_click(ActionEvent event) throws Exception {
    	
		
    	//Получение логина и пароля из полей ввода
		//String authorization = login.getText()+":"+password.getText();
    	String authorization = "admin@air54:8FXrwp93eJ99KM5";
    	
    	//Преобразование логина и пароля в нужную кодировку
    	Base64.Encoder enc = Base64.getEncoder();
        byte[] encbytes = enc.encode(authorization.getBytes());
        authorization = "Basic " + new String(encbytes);
        //System.out.println(authorization);
    	
    	//Ссылка для выполнения запроса
    	URL url = new URL("https://iiot.gov.ru/public/auth/authenticator/api/internalauth/auth");
    	HttpURLConnection http = (HttpURLConnection)url.openConnection();
    	http.setRequestMethod("POST");
    	http.setDoOutput(true);
    	
    	//Определение свойст запроса, добавление заголовка авторизации с логином и паролем
    	http.setRequestProperty("Accept", "application/json");
    	http.setRequestProperty("Authorization", authorization);
    	http.setRequestProperty("Content-Type", "application/json");
    	http.setRequestProperty("Content-Length", "0");
    	//String json = IOUtils.toString(url, Charset.forName("UTF-8"));
    	
    	String otv = "";
    	
    	//Чтение контента, возращаемого при выполнении запроса
		try (final BufferedReader in = new BufferedReader(new InputStreamReader(http.getInputStream()))) {
			String inputLine;
		    final StringBuilder content = new StringBuilder();
		    while ((inputLine = in.readLine()) != null) { content.append(inputLine); }
		    
		    //System.out.println(content.);
		    otv = content.toString(); 
		    

	    	//Проверка на открытие второй формы
	    	if (otv.length() != 0) 
	    		{
	    			//Перевод в json формат
	    			Foo targetObject = new Gson().fromJson(otv, Foo.class);
	    			label_info.setText("Токен получен!");
	    			//Сохранение Токена для дальнейшей работы
	    	    	MainApp.token = targetObject.sessionToken;
	    	    	//Загрузка второй формы
	    			MainApp.setRoot("primary2");
	    		}
	    	//Не удалось прочитать ответ запроса
	    	else label_info.setText("Что-то пошло не так...");
		}
		catch (final Exception ex) {
			//Код ошибки при выполнении запроса > 400
			label_info.setText("Ошибка в выполнении запроса! Проверьте Логин и Пароль!");
		}
		//Закрытие соединения запроса
    }

    @FXML
    void initialize() {
        assert label_info != null : "fx:id=\"label_info\" was not injected: check your FXML file 'primary.fxml'.";
        assert login != null : "fx:id=\"login\" was not injected: check your FXML file 'primary.fxml'.";
        assert password != null : "fx:id=\"password\" was not injected: check your FXML file 'primary.fxml'.";
        assert sign != null : "fx:id=\"sign\" was not injected: check your FXML file 'primary.fxml'.";

    }

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}

}
