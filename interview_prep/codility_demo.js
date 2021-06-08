//given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.

function solution(A) {
    
    //acending order
    var sortedArray = A.sort((a,b) => {return a-b});

    //get unique value
    var uniqArray = [...new Set(sortedArray)];

    //find the position of the first element that is bigger than 0
    var index = uniqArray.findIndex( (num) => {return num>0});

    var smallestInteger;

    var i = index;
    var check = true;

    if(index === -1 || uniqArray[index] > 1){
        return 1;
    }

    while(check && i<uniqArray.length-1) {
        
            if(uniqArray[i+1] - uniqArray[i] > 1) {

                check = false;
                smallestInteger = uniqArray[i] + 1;
            }   

            i++;
    }
    
    if(check === true) {
        return uniqArray[i]+1;
    }

    return smallestInteger;
}