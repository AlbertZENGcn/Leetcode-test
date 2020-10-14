    public class ArrayQueue{
        private String [] items;
        private int n=0;
        private int head=0;
        private int tail=0;
        //initialize
        public ArrayQueue(int capacity){
            items= new String[capacity];
            n=capacity;
        }
        //enqueue
        public boolean enqueue(String item){
            if(tail==n){
            return false;
            }//full
            items[tail]=item;
            ++tail;
            return true;
        }
        //dequeue
        public boolean dequeue(){
            if(head==0){
                return false;
            }
            items[head]=item;
            ++head;
            return true;
        }


    }