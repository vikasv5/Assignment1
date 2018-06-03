Install Netbeans IDE

Clone the project using git clone command

Install the all the maven netbeans plugings

wing maven pluging in the netbeans
Maven Utilities 
Mavne Runner
set JDK for maven projects
Maven Remote Search

Install postman 

Right click on the project and do a clean and build. 
Run the Project


Run the  get command in the postman
http://localhost:8080/RestApi/webapi/orders

You should be able to see all the existing orders. I have hardcoded one order for reference.


Now run the post command, on the URL http://localhost:8080/RestApi/webapi/orders

Put the below XML in the body

 <order>
        <dealer>
            <dealerId>dealer3</dealerId>
            <dealeraccesskey>access3</dealeraccesskey>
        </dealer>
        <deliveryaddress>
            <city>cty</city>
            <name>test</name>
            <postalcode>po1</postalcode>
            <province>p1</province>
            <street>Stg</street>
        </deliveryaddress>
        <id>1</id>
        <items>
            <itemorder>
                <partnumber>511999</partnumber>
                <quantity>3999</quantity>
            </itemorder>
            <itemorder>
                <partnumber>111</partnumber>
                <quantity>9999</quantity>
            </itemorder>
            <itemorder>
                <partnumber>7</partnumber>
                <quantity>1</quantity>
            </itemorder>
        </items>
        <name>Hello 1</name>
    </order>


Select the raw radio button and Application XML as the body format.
Run the Post command with different Address values

The valid dealerids are 

dealer1, access1
dealer2, access2
dealer3, access3
