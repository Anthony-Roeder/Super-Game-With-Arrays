/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package roeder_3_methodmadness;



import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
 

/**
 *
 * @author aroeder
 */
public class Roeder_3_MethodMadness extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        primaryStage.setTitle("Method Madness");
        Group root = new Group();
        Canvas canvas = new Canvas(1080, 720);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        drawShapes(gc);
        drawHouse(gc);
        drawWindows(gc);
        drawLine(gc);
        root.getChildren().add(canvas);
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }
    
    
    
   private void drawShapes(GraphicsContext gc){
       gc.setFill(Color.BISQUE);
       gc.setStroke(Color.BLACK);
       gc.setLineWidth(300);
       gc.setFill(Color.BLACK);
       gc.setStroke(Color.GREEN);
       gc.strokeLine(0,600 ,1080 ,600 );
   }
   private void drawHouse(GraphicsContext gc){
       gc.setFill(Color.BLACK);
       gc.setStroke(Color.BLACK);
       gc.setLineWidth(5);
       gc.setFill(Color.BLACK);
       gc.setStroke(Color.BLACK);
       gc.strokeLine(270, 450, 810, 450);
       gc.strokeLine(270, 450, 270, 250);
       gc.strokeLine(810, 450, 810, 250);
       gc.strokeLine(270, 250, 810,250 );
       gc.strokeLine(810,250 ,540 ,100);
       gc.strokeLine(270,250,540,100);
       gc.strokeLine(520, 375, 520, 450);
       gc.strokeLine(560,375,560,450);
       gc.strokeLine(520,375 , 560, 375);
       gc.fillOval(550, 410, 3, 4);
       
   } 
   private void drawWindows(GraphicsContext gc){
       gc.setFill(Color.SKYBLUE);
       gc.fillRect(325, 305, 150, 100);
       gc.fillRect(600 ,305 ,150, 100);
   }
   private void drawLine(GraphicsContext gc){
       gc.setFill(Color.BLACK);
       gc.setStroke(Color.BLACK);
       gc.setLineWidth(5);
       gc.setFill(Color.BLACK);
       gc.setStroke(Color.BLACK);
       gc.strokeLine(328,360,473,360);
       gc.strokeLine(400.5, 307,400.5, 403);
       gc.strokeLine(603, 360, 747, 360);
       gc.strokeLine(675,307 ,675,403);
   }
   

                       
        
    

    /**
     * @param args the command line arguments
     */
        public static void main(String[] args) {
        launch(args);
    }
}

    


   
