package edu.okstate.cs.tashwin.android_object_animator;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    protected float imageXPosition = 0;
    protected float imageYPosition = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    /*This method is used to get the X & Y co-ordinates of the image view so that it can be moved to original position after animation*/
    public void onWindowFocusChanged (boolean hasFocus) {
        ImageView img = (ImageView) findViewById(R.id.imageView2);
        //Store X & Y values in two variables
        imageXPosition = img.getX();
        imageYPosition = img.getY();
    }

    /*This method will be executed when flip vertically button is pressed*/
    public void flipVerticallyPressed(View view){
        ImageView img = (ImageView) findViewById(R.id.imageView2);
        //Create animation obejct
        Animator flip_vertical_animation = AnimatorInflater.loadAnimator(this, R.animator.flip_vertical);
        //Set target
        flip_vertical_animation.setTarget(img);
        //Start animation
        flip_vertical_animation.start();
    }

    /*This method will be executed when flip horizontally button is pressed*/
    public void flipHorizontallyPressed(View view){
        ImageView img = (ImageView) findViewById(R.id.imageView2);
        //Create animation object
        Animator flip_vertical_animation = AnimatorInflater.loadAnimator(this, R.animator.flip_horizontally);
        //Set target
        flip_vertical_animation.setTarget(img);
        //Start animation
        flip_vertical_animation.start();
    }

    /*This method will be executed when flip horizontally button is pressed*/
    public void moveImagePressed(View view){
        ImageView img = (ImageView) findViewById(R.id.imageView2);
        //Create animator set
        AnimatorSet flip_vertical_animation = (AnimatorSet) AnimatorInflater.loadAnimator(this, R.animator.move_image);
        //Set target
        flip_vertical_animation.setTarget(img);
        //Start animation
        flip_vertical_animation.start();
    }
    /*This method will be executed when resety button is pressed*/
    public void resetPressed(View view){
        ImageView img = (ImageView) findViewById(R.id.imageView2);
        img.setX(imageXPosition);
        img.setY(imageYPosition);
    }
}
