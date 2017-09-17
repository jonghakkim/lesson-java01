package lotto;

class LottoP {

  String numtoString(int arr[]) {
    String str="";
    
    for (int i = 0; i < arr.length; i++) {

      str += arr[i] + "   ";

    }
    return str;

  }
  
  // 버블정렬 메소드
  void bubbleSort(int arr[]){
    int temp = 0;
        
    for (int j=0;j<arr.length-1;j++) {
      for (int i=0;i<arr.length-1;i++) {
        if (arr[i]>arr[i+1]){
          temp = arr[i];
          arr[i] = arr[i+1];
          arr[i+1] = temp;
        }
      }
    }
  }
  

  

}