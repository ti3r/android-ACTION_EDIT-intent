/**
 * Action Edit Examples is an android application that shows different
 * exercises of how to use the ACTION_INTENT action with your Intents.
 * Copyright (C) 2011  Alexandro Blanco <ti3r.bubblenet@gmail.com>
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.blanco.examples.actionedit;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        init();
    }
    
    public void init(){
    	Button btnCalendar = (Button) findViewById(R.id.btn_launch_calendar);
    	btnCalendar.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				launchActionEditForCalendar();
			}

		});
    }
   
    private void launchActionEditForCalendar() {
		Intent intent = new Intent(Intent.ACTION_EDIT);
		intent.setType("vnd.android.cursor.item/event");
		intent.putExtra("title","Titulo");
		intent.putExtra("description", "descripcion del evento");
		startActivity(intent);
	}
    
}