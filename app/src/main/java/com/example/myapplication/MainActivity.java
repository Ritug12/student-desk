package com.example.myapplication;



import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.firebase.ui.auth.AuthUI;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //Creating onActivityResult and checking response code to make sure we get right request.
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        //Checking for request code
        if(requestCode==12345){
            //Successfully signed-in
            if(resultCode==RESULT_OK){
                //Getting the current user
                FirebaseUser user=FirebaseAuth.getInstance().getCurrentUser();
                //Showing toast
                Toast.makeText(getApplicationContext(),"Successfully signed-in",Toast.LENGTH_SHORT).show();
                Intent activityChangeIntent = new Intent(MainActivity.this, Dashboard.class);

                // currentContext.startActivity(activityChangeIntent);

                MainActivity.this.startActivity(activityChangeIntent);
            }
        }else{
            //Signed-in failed. If response is null the user canceled the sign-in flow using the back button.
            //respose.getError().getErrorCode() handle the error.
            Toast.makeText(getApplicationContext(),"Unabled to sign in",Toast.LENGTH_SHORT).show();
        }
    }
    //Creating sign-in function which is called on button sign-in button click
    public void sign_in(View view) {
        FirebaseAuth auth = FirebaseAuth.getInstance();
        if (auth.getCurrentUser() != null) {
            Toast.makeText(getApplicationContext(), "User already sign in signout first", Toast.LENGTH_SHORT).show();
            Intent activityChangeIntent = new Intent(MainActivity.this, Dashboard.class);

            // currentContext.startActivity(activityChangeIntent);

            MainActivity.this.startActivity(activityChangeIntent);
        }else{
            //Choosing Authentication provider
            List<AuthUI.IdpConfig> providers= Arrays.asList(
                    new AuthUI.IdpConfig.EmailBuilder().build(),
                    new AuthUI.IdpConfig.PhoneBuilder().build(),
                    new AuthUI.IdpConfig.GoogleBuilder().build());

            //Creating and launching sign-in intent
            startActivityForResult(AuthUI.getInstance().createSignInIntentBuilder().setAvailableProviders(providers).build(),12345);
        }
    }
    //Creating sign-out function which is called on button sign-out button click
//    public void sign_out(View view) {
//        AuthUI.getInstance().signOut(this).addOnCompleteListener(new OnCompleteListener<Void>() {
//            @Override
//            public void onComplete(@NonNull Task<Void> task) {
//                //User is now signed out
//                Toast.makeText(getApplicationContext(),"User is signed out",Toast.LENGTH_SHORT).show();
//            }
//        });
//    }
//    public void delete_user(View view) {
//        AuthUI.getInstance().delete(this).addOnCompleteListener(new OnCompleteListener<Void>() {
//            @Override
//            public void onComplete(@NonNull Task<Void> task) {
//                if (task.isSuccessful()) {
//                    Toast.makeText(getApplicationContext(), "User is deleted successfully", Toast.LENGTH_SHORT).show();
//                } else {
//                    Toast.makeText(getApplicationContext(), "Unsuccessful", Toast.LENGTH_SHORT).show();
//                }
//            }
//        });
//    }
}
