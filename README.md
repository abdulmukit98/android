# android

### toast
	
	Toast.makeText(	getApplicationContext(),
					"message",
					Toast.LENGTH_LONG).show();


### Button clickable	
	
        btns.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                
            }
        });

### EditText

	edtN.getText().toString()
	

### Gravity
	
		android:gravidy move the inner content of the layout
		
        	android:gravity="center"
 			

		layout_gravity move the total layout
	      
	        android:layout_gravity="center"

### Recyclar View

		1 
		recyclar view adapter
		interact with the recycler view
		
		2
		recyclar view viewholder
		access each item of recyclar view
		
		
### Picasso

```

	implementation 'com.squareup.picasso:picasso:2.71828'

	manifest
	    <uses-permission android:name="android.permission.INTERNET" />


	Picasso.get().load(imageUri).into(imageView);
	or
	imageView.setImageUri(imageUri)

```

### progress bar


    <ProgressBar
        android:id="@+id/mProgress"
        style="@style/Widget.AppCompat.ProgressBar.Horizontal"

        **android:indeterminate="true"**
        android:indeterminateTint="@color/black"
        
	/>
