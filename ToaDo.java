
public class ToaDo implements Diem{
  public void xapXepGiam(double[] arr){
    for(int i=0; i<arr.length; i++){
       for(int j = i+1; j< arr.length-1; j++){
        int viTriLonNhat = j;
            if(arr[i] > arr[viTriLonNhat])
            viTriLonNhat = i;
            double tem = arr[viTriLonNhat];
            arr[viTriLonNhat] = arr[j];
            arr[j] = tem;
          }
       }
  }
  public void xapXepTang(double[] arr){
    for(int i=0; i<arr.length; i++){
      for(int j=i+1; j<arr.length-1; j++){
         if(arr[i] > arr[j])
         i = j;
         double temp = arr[i];
         arr[i] = arr[j];
         arr[j] = temp;
      }
    }
  }
}
