public class test0817 implements List {
	private int[] array;      //保存数据
	private int size;         //保存array中已经有的数据个数
	
	public List(){
		array=new int[11];  //11可调节
		size=0;
	}
    // 尾插
    boolean add(int element){
    // 把数据插入到 index 下标处
	   array[index] = element;
	   return 0;
	}
    
    boolean add(int index, int element){
		if(index < 0 || index >= size){
			System.out.printf("index不合法");
			return -1;
		}
		for(int i = size-1;i >= index;i--){
             array[i+1] = array[i];			
		}
		array[index] = element;
		size++;
		return 0;
	}

    int get(int index){
		if(index<0||index>=size){
			System.out.printf("index不合法");
		}
		for(int i = 0;i < size;i++){
			if(i == index){
				return array[i];
			}
		}
		return -1;
	}

    int set(int index, int val){
		for(int i = 0;i <= size;i++){
			if(i == index){
				array[i] = val;
			}
		}
		return -1;
	}

    // 删除指定位置的数据
    int remove(int index){
		if(index<0||index>=size){
			System.out.printf("index不合法");
		}
		for(int i=index;i <= size-1; i++){
			array[i]=array[i+1];
		}
		size--;
		return 0;
		
	}
    int size(){
		return size;
	}

    boolean isEmpty(){
		return size == 0;
	}

    public Iterator iterator(){
		return null;
	}
   }
