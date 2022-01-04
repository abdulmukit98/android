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
