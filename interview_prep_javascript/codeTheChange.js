function isValidShape(sideLengths, numOfSides) {

    var sortedArray = sideLengths.sort(function(a,b){return a-b});
    
    //get the size of logest side
    var longestSide = sortedArray[numOfSides - 1];
    var sumOfRest = 0;

    //get sum of rest sides
    for(var i=0; i < numOfSides-1; i++) {

        sumOfRest += sortedArray[i];
    }

    //return true or false
    return (longestSide <= sumOfRest);
}
