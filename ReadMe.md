This is a Sample Springboot project exposing a Rest API to Get List of Products by an Optional Criteria attribute.
## 1.High Level Context
![1.High Level Context](Documentation/High_Level_Context.png)

## 2a.Approach-1 : System Arch Diagram
![2a: Approach-1 : System Arch Diagram](Documentation/Approach_1_Using_Lambda_Serverless.png)

## 2b.Approach-2 : System Arch Diagram
![2b: Approach-2 : System Arch Diagram](/Documentation/Approach_2_Using_EC2.png)

## 3:Sequence Diagram
![2b: Approach-2 : System Arch Diagram](/Documentation/Sequence_diagram_For_Get.png)

## 4:DataModel:
  ![4.DataModel](Documentation/DataModel.png)


## Project Execution Process :

  I would create  Jira Tickets/Rally User stories under the Product Catalog Mmgt Feature as below : 
  
 But at a high level need to outline the activities and track the activities :  Design/Setup/Build/Test/Release. 

 In this context, it makes sense to split by individual business functions (i.e API's which support different business capabilities). 
  ## Feature-F123 : Product Catalog Management 
   # US-1 (GET Products) 
   # US-2 (ADD Product) 
   # US-3 (UPDATE Product) 
   # US-4 (DELETE Product) 
    //Below are the Tech enabler stories which are needed before functional stories can be delivered. 
   # US-00 (Define API Specs) 
   # US-01(DataModel Design) 
   # US-02 (Infrasetup) 
   # US-03 (DB setup (Schema/DDL)) 
    
   Also we can have 
   # US-NFR (eg: Performance,Security)   - This can be baked into the a task in functional user-stories also instead of standalone user story. 
 
 
  For each user story , we can have the below **Tasks** under the User Stories based on the context/need. 
   # 1) Analyze 
   # 2) Build 
   # 3) Test
   # 4) Review 
   # 5) Deploy 
   # 6) Release
    





Product Catalog Management API’s



SNO
API
Purpose
Details
1
Get List of Products
To get the list of Products
GET  :   /products
2
Create/Add Product
Add a Product to the existing Catalog
POST : /products

Body:  with Product to be added
3
Update Product
Update an existing Product
PUT : /products/:id
Body:  with Product to to be added
4
Delete Product
Delete an existing Product.
DELETE : /products/:id




1)GET  products
Resource URL
 
GET http://{host:port}/api/products
 
Resource Information

Response format
JSON
Requires Authentication
Yes
Authentication Details
OAuth <Refer to details outlined>



Parameters



Name
Required
Description
Default Value
Example
category
Optional
Category of the Product


Kitchen




Response:

<Response format>

Success :200

Code/Description for all the possible API responses.
Eg: 401/403/404


Sample Response:

{
    "products": [
        {
            "productName": "WW by Build 30 oz Tumbler ",
            "description": "WW by Build 30 oz Tumbler 5052013P",
            "url": "/ww-by-built-30oz-tumbler",
            "currency": "USD",
            "category": "Kitchen",
            "subCategory": "Drinkware",
            "Medias": [
                {
                    "url": "http://domain-name/assetspath/unique-image-name",
                    "altText": "WW by Build 30 oz Tumbler"
                }
            ],
            "SKUs": [
                {
                    "name": "WW by Build 30 oz Tumbler (RED)",
                    "description": "DESCRIPTION",
                    "retailPrice": "110",
                    "sailPrice": "85",
                    "inventoryType": "SKU",
                    "quantityAvailable": "Y"
                },
                {
                    "name": "WW by Build 30 oz Tumbler (GREY)",
                    "description": "DESCRIPTION",
                    "retailPrice": "100",
                    "sailPrice": "80",
                    "inventoryType": "SKU",
                    "quantityAvailable": "Y"
                }
            ]
        },
        {
            "productName": "Dash 2 Qt Compact Air Fryer",
            "description": "Dash 2 Qt Compact Air Fryer 85490000P",
            "url": "/ww-by-built-2qt-airfryer",
            "currency": "USD",
            "category": "Kitchen",
            "subCategory": "Small Appliances",
            "Medias": [
                {
                    "url": "http://domain-name/assetspath/unique-image-name",
                    "altText": "Dash 2 Qt Compact Air Fryer"
                }
            ],
            "SKUs": [
                {
                    "name": "Dash 2 Qt Compact Air Fryer(RED)",
                    "description": "DESCRIPTION",
                    "retailPrice": "170",
                    "sailPrice": "150",
                    "inventoryType": "SKU",
                    "quantityAvailable": "Y"
                },
                {
                    "name": "Dash 2 Qt Compact Air Fryer (GREY)",
                    "description": "DESCRIPTION",
                    "retailPrice": "160",
                    "sailPrice": "140",
                    "inventoryType": "SKU",
                    "quantityAvailable": "Y"
                }
            ]
        }
    ],
    "productsCnt": 2
}





2) POST Products


POST http://localhost:8080/api/products
 
Resource Information

Response format
JSON
Requires Authentication
Yes
Authentication Details
OAuth <Refer to details outlined>



Request Format ;
        <Product Json structure >

Response Format:

HTTP Response Success Code : 201.
Description :



PUT http://localhost:8080/api/products/:productId
 
Resource Information

Response format
JSON
Requires Authentication
Yes
Authentication Details
OAuth <Refer to details outlined>



Request Format ;
        <Product Json structure >

Response Format:

HTTP Response Success Code : 201.
Description :

