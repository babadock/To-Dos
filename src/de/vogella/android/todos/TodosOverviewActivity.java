package de.vogella.android.todos;

import de.vogella.android.todos.database.TodoTable;
import android.app.ListActivity;
import android.app.LoaderManager;
import android.content.Loader;
import android.database.Cursor;
import android.os.Bundle;

public class TodosOverviewActivity extends ListActivity implements
		LoaderManager.LoaderCallbacks<Cursor> {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.todo_list);
		fillData();

	}

	private void fillData() {
		String[] from =  new String[] {TodoTable.COLUMN_SUMMARY};
		int[] to = new int[] {R.id.label};
		
		getLoaderManager().initLoader(0, null, this);
		
		
	}

	@Override
	public Loader<Cursor> onCreateLoader(int id, Bundle args) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void onLoadFinished(Loader<Cursor> loader, Cursor data) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onLoaderReset(Loader<Cursor> loader) {
		// TODO Auto-generated method stub

	}
}
