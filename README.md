############################################################################################
>> Stack and Heap with reference variable-=reference variable is car in Car car = new Car()-this is the local variable in main method
>> Garbage collection will be in Heap, it comes to picture when need to clear the object
>> Instance variable mew Car car =new Car()-Car is the class, it instanciate to car to get state of object Car.
#############################################################################
>> Inheritance: extends the family class by child class
>> Interface:
>> Overriding means replace the operation of the function
>> Interface is similar to abstract 
>> There should be methods of interface class in the implements class

###################################################################
>> try and catch should use to handle the exception
>> After java 7, Autocloseable method come to the pucture so that user don't have to have finally block
>> Something this 
    try (FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);){
    catch{}
> 
> ###########################################################################
> COLLECTIONS
> 
> Arraylist: ArrayList words = new ArrayList();
>   It is fast for retrieving the data whereas slow to manipulate the data
>   Vehicle{make='Ford', model='Hummer', price=120000, fourWDrive=true}
> 
> LinkedList: LinkedList <Integer> numbers = new LinkedList<>()
>   It is fast for manipulate the data whereas slow to retrieving the data
>   Vehicle{make='Ford', model='Hummer', price=120000, fourWDrive=true}
> 
> HashSet<Integer> values = new HashSet<>();
>   it won't print the repeated data
>   It won't maintained the order as it has in the list
>   to print data in ascending order, need to use LinkedHashSet
> HashSet<Employee> hashSet = new HasSet<>();
>   Employee type will get from Employee class
> 
> HashMap<String,String> hashMap = new HashMap();
>   hasmap took key and value, here String, String means key and value
>   if need to print in order, have to use linkedHasMap
>   MAP COLLECTION CANN'T HAVE DUPLICATE KEYS, IT WILL OVERRIDE THE VALUE WITH LATEST ONE