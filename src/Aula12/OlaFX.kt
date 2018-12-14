package Aula12

import javafx.application.Application
import javafx.fxml.FXML
import javafx.fxml.FXMLLoader
import javafx.scene.Scene
import javafx.scene.control.Label
import javafx.scene.control.TextField
import javafx.stage.Stage

class OlaFX:Application() {

    @FXML lateinit var input:TextField
    @FXML lateinit var output:Label

    fun btnclique(){
        output.text = "Texto digitado: [${input.text}]"
        input.clear()
    }
    override fun start(stage: Stage) {
        //TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        stage.scene = Scene(FXMLLoader.load(javaClass.getResource("OlaFX.fxml")))
        stage.show()
        //https://www.youtube.com/watch?v=YfEim69NQOY video com o passo-a-passo
    }
}

fun main(args: Array<String>) {
   // Application.launch(OlaFX::class.java, *args)

}