# restourant_web_app
Maven Spring Boot App
<h2><a id="user-content-what-it-does" class="anchor" aria-hidden="true" href="#what-it-does"><svg class="octicon octicon-link" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M7.775 3.275a.75.75 0 001.06 1.06l1.25-1.25a2 2 0 112.83 2.83l-2.5 2.5a2 2 0 01-2.83 0 .75.75 0 00-1.06 1.06 3.5 3.5 0 004.95 0l2.5-2.5a3.5 3.5 0 00-4.95-4.95l-1.25 1.25zm-4.69 9.64a2 2 0 010-2.83l2.5-2.5a2 2 0 012.83 0 .75.75 0 001.06-1.06 3.5 3.5 0 00-4.95 0l-2.5 2.5a3.5 3.5 0 004.95 4.95l1.25-1.25a.75.75 0 00-1.06-1.06l-1.25 1.25a2 2 0 01-2.83 0z"></path></svg></a>What it does</h2>
<p>It is an web applciation, it let allow the user to login into the application. User can view list of product that available and user can order products, add and remove products from the cart. Admin can add/update/delete categories and products.</p>
<hr>
<h2><a id="user-content-solution-description" class="anchor" aria-hidden="true" href="#solution-description"><svg class="octicon octicon-link" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M7.775 3.275a.75.75 0 001.06 1.06l1.25-1.25a2 2 0 112.83 2.83l-2.5 2.5a2 2 0 01-2.83 0 .75.75 0 00-1.06 1.06 3.5 3.5 0 004.95 0l2.5-2.5a3.5 3.5 0 00-4.95-4.95l-1.25 1.25zm-4.69 9.64a2 2 0 010-2.83l2.5-2.5a2 2 0 012.83 0 .75.75 0 001.06-1.06 3.5 3.5 0 00-4.95 0l-2.5 2.5a3.5 3.5 0 004.95 4.95l1.25-1.25a.75.75 0 00-1.06-1.06l-1.25 1.25a2 2 0 01-2.83 0z"></path></svg></a>Solution Description</h2>
<ul>
<li>Ecommerce application have functional capable of listing the product in proper pagination, let the user to search the product by using the name and user can view the products by sorting of the rating. (low to high and high to low).</li>
<li>Application allow the user to add the one or more products to their cart and user can order them either from home page or cart page. Adding or removing products will create or delete a record in cart table against the user.</li>
<li>The backend API are exposed to consume and have with any other frontend UI.</li>
</ul>
<hr>
<h2><a id="user-content-api-exposed-from-ecommerce-microservice" class="anchor" aria-hidden="true" href="#api-exposed-from-ecommerce-microservice"><svg class="octicon octicon-link" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M7.775 3.275a.75.75 0 001.06 1.06l1.25-1.25a2 2 0 112.83 2.83l-2.5 2.5a2 2 0 01-2.83 0 .75.75 0 00-1.06 1.06 3.5 3.5 0 004.95 0l2.5-2.5a3.5 3.5 0 00-4.95-4.95l-1.25 1.25zm-4.69 9.64a2 2 0 010-2.83l2.5-2.5a2 2 0 012.83 0 .75.75 0 001.06-1.06 3.5 3.5 0 00-4.95 0l-2.5 2.5a3.5 3.5 0 004.95 4.95l1.25-1.25a.75.75 0 00-1.06-1.06l-1.25 1.25a2 2 0 01-2.83 0z"></path></svg></a>API Exposed from Ecommerce Microservice</h2>
<table>
<thead>
<tr>
<th align="left">Method</th>
<th align="left">Operation Id</th>
<th align="left">URL</th>
<th align="left">Description</th>
</tr>
</thead>
<tbody>
<tr>
<td align="left">POST</td>
<td align="left">createUser</td>
<td align="left">/register/user</td>
<td align="left">Create a user</td>
</tr>
<tr>
<td align="left">GET</td>
<td align="left">logIn</td>
<td align="left">/user/logIn/{emailId}</td>
<td align="left">Validate user emailId for log in</td>
</tr>
<tr>
<td align="left">GET</td>
<td align="left">getProduct</td>
<td align="left">/shop/viewproduct/{productId}</td>
<td align="left">Fetch the products from product table.<br>API Will return all the products by passing All in param</td>
</tr>
<tr>
<td align="left">POST</td>
<td align="left">addProductInCart</td>
<td align="left">/shop/cart</td>
<td align="left">Add the product to cart, userId and productId should pass in request body</td>
</tr>
<tr>
<td align="left">DELETE</td>
<td align="left">removeProductFromCart</td>
<td align="left">/shop/cart/{productId}/{userId}</td>
<td align="left">Delete a product from cart based on userId and productId</td>
</tr>
</tbody>
</table>
<hr>
<h2><a id="user-content-languages--frameworks" class="anchor" aria-hidden="true" href="#languages--frameworks"><svg class="octicon octicon-link" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M7.775 3.275a.75.75 0 001.06 1.06l1.25-1.25a2 2 0 112.83 2.83l-2.5 2.5a2 2 0 01-2.83 0 .75.75 0 00-1.06 1.06 3.5 3.5 0 004.95 0l2.5-2.5a3.5 3.5 0 00-4.95-4.95l-1.25 1.25zm-4.69 9.64a2 2 0 010-2.83l2.5-2.5a2 2 0 012.83 0 .75.75 0 001.06-1.06 3.5 3.5 0 00-4.95 0l-2.5 2.5a3.5 3.5 0 004.95 4.95l1.25-1.25a.75.75 0 00-1.06-1.06l-1.25 1.25a2 2 0 01-2.83 0z"></path></svg></a>Languages &amp; Frameworks</h2> 
<ol>
<li>Backend</li>
</ol>
<ul>
<li>Java</li>
<li>Spring Boot</li>
<li>Maven</li>
<li>MySQL DB</li>
</ul>
<ol start="2">
<li>FrontEnd</li>
</ol>
<ul>
<li>Bootstrat Navbar </li>
<li>HTML/CSS</li>
<li>JS</li>
</ul>
<hr>
