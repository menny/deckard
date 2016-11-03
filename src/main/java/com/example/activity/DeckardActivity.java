package com.example.activity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.R;

public class DeckardActivity extends Activity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.deckard);
    ListView listView = (ListView) findViewById(android.R.id.list);
    listView.setFastScrollEnabled(true);
  }
}
