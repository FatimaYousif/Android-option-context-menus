package com.example.menuitems50;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.annotation.SuppressLint;
import android.content.ClipData;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.Layout;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {


    //textviews used to cover the deletion part
    TextView item1;
    TextView item2;
    TextView item3;

    //MATCHING
     TextView match ;

    @SuppressLint("ResourceType")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("50 menu items-demo");

        item1=(TextView)findViewById(R.id.item1);
        item2=(TextView)findViewById(R.id.item2);
        item3=(TextView)findViewById(R.id.item3);

        registerForContextMenu(item1);
        registerForContextMenu(item2);
        registerForContextMenu(item3);
    }
    //context menu
    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.contextmenu, menu);
        match =(TextView)v;
    }

    //selection of item option
    @Override
    public boolean onContextItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.delete:
                //show dialog box
                onClickShowAlert(match);
                return true;
        }
        return super.onContextItemSelected(item);
    }

    //alert or dialogue box
        public void onClickShowAlert(TextView match)
        {
            AlertDialog.Builder myAlertBuilder = new AlertDialog.Builder(MainActivity.this);

            // Set the dialog title and message.
            myAlertBuilder.setTitle("Alert");
            myAlertBuilder.setMessage("Are you sure you want to delete this item?");

            // Add the dialog buttons.
            myAlertBuilder.setPositiveButton("OK", new DialogInterface.OnClickListener()
            {
                public void onClick(DialogInterface dialog, int which)
            {
                // User clicked OK button.

                if(match.equals(item1))
                {
                    item1.setVisibility(View.GONE);
                }

                else if(match.equals(item2))
                {
                    item2.setVisibility(View.GONE);
                }
                else
                {
                    item3.setVisibility(View.GONE);
                }

                //Toast.makeText(getApplicationContext(), "Pressed OK", Toast.LENGTH_SHORT).show();
            }

            });
            myAlertBuilder.setNegativeButton("Cancel", new DialogInterface.OnClickListener()
            {
                public void onClick(DialogInterface dialog, int which)
                {
                    // User cancelled the dialog.
                    Toast.makeText(getApplicationContext(), "Pressed Cancel", Toast.LENGTH_SHORT).show();
                }
            });
            // Create and show the AlertDialog.
            myAlertBuilder.show(); }


    //----------------------------------------------------------------------------------------------
    //options menu
        @Override
        public boolean onCreateOptionsMenu(Menu menu) {
            MenuInflater inflater=getMenuInflater();
            inflater.inflate(R.menu.fifty_items, menu);
            return true;
        }

        @Override
        public boolean onOptionsItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()){
                case R.id.one:
                    Toast.makeText(this,"ONE",Toast.LENGTH_LONG).show();
                    return true;
                case R.id.two:
                    Toast.makeText(this, "TWO", Toast.LENGTH_SHORT).show();
                    return true;
                case R.id.three:
                    Toast.makeText(this, "THREE", Toast.LENGTH_SHORT).show();
                    return true;
                case R.id.four:
                    Toast.makeText(this, "FOUR", Toast.LENGTH_SHORT).show();
                    return true;
                case R.id.five:
                    Toast.makeText(this, "FIVE", Toast.LENGTH_SHORT).show();
                    return true;
                case R.id.six:
                    Toast.makeText(this, "SIX", Toast.LENGTH_SHORT).show();
                    return true;
                case R.id.seven:
                    Toast.makeText(this, "SEVEN", Toast.LENGTH_SHORT).show();
                    return true;
                case R.id.eight:
                    Toast.makeText(this, "EIGHT", Toast.LENGTH_SHORT).show();
                    return true;

                case R.id.nine:
                    Toast.makeText(this, "NINE", Toast.LENGTH_SHORT).show();
                    return true;
                case R.id.ten:
                    Toast.makeText(this, "TEN", Toast.LENGTH_SHORT).show();
                    return true;
                case R.id.eleven:
                    Toast.makeText(this, "ELEVEN", Toast.LENGTH_SHORT).show();
                    return true;
                case R.id.twelve:
                    Toast.makeText(this, "TWELVE", Toast.LENGTH_SHORT).show();
                    return true;

                case R.id.thirteen:
                    Toast.makeText(this, "THIRTEEN", Toast.LENGTH_SHORT).show();
                    return true;
                case R.id.fourteen:
                    Toast.makeText(this, "FOURTEEN", Toast.LENGTH_SHORT).show();
                    return true;
                case R.id.fifteen:
                    Toast.makeText(this, "FIFTEEN", Toast.LENGTH_SHORT).show();
                    return true;
                case R.id.sixteen:
                    Toast.makeText(this, "SIXTEEN", Toast.LENGTH_SHORT).show();
                    return true;
                case R.id.seventeen:
                    Toast.makeText(this, "SEVENTEEN", Toast.LENGTH_SHORT).show();
                    return true;
                case R.id.eighteen:
                    Toast.makeText(this, "EIGHTEEN", Toast.LENGTH_SHORT).show();
                    return true;

                case R.id.nineteen:
                    Toast.makeText(this, "NINETEEN", Toast.LENGTH_SHORT).show();
                    return true;
                case R.id.twenty:
                    Toast.makeText(this, "twenty", Toast.LENGTH_SHORT).show();
                    return true;
                case R.id.twentyone:
                    Toast.makeText(this, "twentyone", Toast.LENGTH_SHORT).show();
                    return true;
                case R.id.twentytwo:
                    Toast.makeText(this, "twentytwo", Toast.LENGTH_SHORT).show();
                    return true;
                case R.id.twentythree:
                    Toast.makeText(this, "twentythree", Toast.LENGTH_SHORT).show();
                    return true;
                case R.id.twentyfour:
                    Toast.makeText(this, "twentyfour", Toast.LENGTH_SHORT).show();
                    return true;
                case R.id.twentyfive:
                    Toast.makeText(this, "twentyfive", Toast.LENGTH_SHORT).show();
                    return true;
                case R.id.twentysix:
                    Toast.makeText(this, "twentysix", Toast.LENGTH_SHORT).show();
                    return true;
                case R.id.twentyseven:
                    Toast.makeText(this, "twentyseven", Toast.LENGTH_SHORT).show();
                    return true;
                case R.id.twentyeight:
                    Toast.makeText(this, "twentyeight", Toast.LENGTH_SHORT).show();
                    return true;
                case R.id.twentynine:
                    Toast.makeText(this, "twentynine", Toast.LENGTH_SHORT).show();
                    return true;
                case R.id.thirty:
                    Toast.makeText(this, "thirty", Toast.LENGTH_SHORT).show();
                    return true;
                case R.id.thirtyone:
                    Toast.makeText(this, "thirtyone", Toast.LENGTH_SHORT).show();
                    return true;

                case R.id.thirtytwo:
                    Toast.makeText(this, "thirty2", Toast.LENGTH_SHORT).show();
                    return true;
                case R.id.thirtythree:
                    Toast.makeText(this, "thirty3", Toast.LENGTH_SHORT).show();
                    return true;
                case R.id.thirtyfour:
                    Toast.makeText(this, "thirty4", Toast.LENGTH_SHORT).show();
                    return true;
                case R.id.thirtyfive:
                    Toast.makeText(this, "thirty5", Toast.LENGTH_SHORT).show();
                    return true;
                case R.id.thirtysix:
                    Toast.makeText(this, "thirty6", Toast.LENGTH_SHORT).show();
                    return true;
                case R.id.thirtyseven:
                    Toast.makeText(this, "thirty7", Toast.LENGTH_SHORT).show();
                    return true;
                case R.id.thirtyeight:
                    Toast.makeText(this, "thirty8", Toast.LENGTH_SHORT).show();
                    return true;
                case R.id.thirtynine:
                    Toast.makeText(this, "thirty9", Toast.LENGTH_SHORT).show();
                    return true;
                case R.id.forty:
                    Toast.makeText(this, "forty", Toast.LENGTH_SHORT).show();
                    return true;
                case R.id.fortyone:
                    Toast.makeText(this, "forty1", Toast.LENGTH_SHORT).show();
                    return true;
                case R.id.fortytwo:
                    Toast.makeText(this, "forty2", Toast.LENGTH_SHORT).show();
                    return true;
                case R.id.fortythree:
                    Toast.makeText(this, "forty3", Toast.LENGTH_SHORT).show();
                    return true;
                case R.id.fortyfour:
                    Toast.makeText(this, "forty4", Toast.LENGTH_SHORT).show();
                    return true;
                case R.id.fortyfive:
                    Toast.makeText(this, "forty5", Toast.LENGTH_SHORT).show();
                    return true;
                case R.id.fortysix:
                    Toast.makeText(this, "forty6", Toast.LENGTH_SHORT).show();
                    return true;
                case R.id.fortyseven:
                    Toast.makeText(this, "forty7", Toast.LENGTH_SHORT).show();
                    return true;
                case R.id.fortyeight:
                    Toast.makeText(this, "forty8", Toast.LENGTH_SHORT).show();
                    return true;
                case R.id.fortynine:
                    Toast.makeText(this, "forty9", Toast.LENGTH_SHORT).show();
                    return true;
                case R.id.fifty:
                    Toast.makeText(this, "50", Toast.LENGTH_SHORT).show();
                    return true;
            }
            return super.onContextItemSelected(item);

        }


}