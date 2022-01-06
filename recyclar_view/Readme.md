### layout

    <androidx.recyclerview.widget.RecyclerView
        android:id="@+id/recyclar"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        
        app:layoutManager="androidx.recyclerview.widget.GridLayoutManager"
        
        />
        
### recyclar_item

    <TextView
        android:id="@+id/riTvName"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_gravity="center_horizontal"
        android:text="Hello"
        android:textSize="30sp" 
        
        />

### model


        public class Data {
            private String string;

            public Data(String string) {
                this.string = string;
            }
            public Data()
            {

            }

            public String getString() {
                return string;
            }

            public void setString(String string) {
                this.string = string;
            }

            @Override
            public String toString() {
                return "Data{" +
                        "string='" + string + '\'' +
                        '}';
            }
        }
        

### Recyclar_adaptar

        public class RecycarAdaptar extends RecyclerView.Adapter<RecyclarViewHolder> {

            List<Data> list;
            Context context;

            public RecycarAdaptar(List<Data> list, Context context) {
                this.list = list;
                this.context = context;
            }

            @NonNull
            @Override
            public RecyclarViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

                LayoutInflater layoutInflater = LayoutInflater.from(context);
                View view = layoutInflater.inflate(R.layout.recyclar_item, parent, false);

                RecyclarViewHolder recyclarViewHolder = new RecyclarViewHolder(view);

                return recyclarViewHolder;
            }

            @Override
            public void onBindViewHolder(@NonNull RecyclarViewHolder holder, int position) {

                holder.textView.setText(list.get(position).getString());

            }

            @Override
            public int getItemCount() {
                return list.size();
            }
        }



### Recyclar_view_holder

        public class RecyclarViewHolder extends RecyclerView.ViewHolder {

            TextView textView;

            public RecyclarViewHolder(@NonNull View itemView) {
                super(itemView);

                textView = itemView.findViewById(R.id.riTvName);

            }
        
        //getAdaptarPosition()

        }
        
        
### Main_activity

        recyclerView = findViewById(R.id.recyclar);

                List<Data> list = new ArrayList<Data>();
                list.add(new Data("Anis"));
                list.add(new Data("Kate"));
                list.add(new Data("Perl"));
                list.add(new Data("Java"));

                RecycarAdaptar recycarAdaptar = new RecycarAdaptar(list, getApplicationContext());      // constructor
                recyclerView.setAdapter(recycarAdaptar);

