<?php
?>

@extends('layouts.default')

@section('css')
    <link rel="stylesheet" type="text/css" href="{{asset('css/careers.css')}}" media="all">
@endsection

@section('main')
    <section class = "intro col-xs-12 col-md-12">
        <div class = "container">
            <div class = "row">
                <div class = "intro-content col-xs-7 col-md-7">
                    <h3>CAREERS</h3>
                    <h1>Explore what's possible</h1>
                </div>
                <div class ="table-job col-xs-5 col-md-5">
                        <h2>Search & Apply</h2>
                        <!-- search start -->

                    <form id="careerSearchUS" name="TaleoFormUS" method="get" action="">
                        <span role="tablist" class="searchCounty form-control">
                            <p class="tabName">
                                <img src = "{{asset('images/United-States-Flag-icon.png')}}" width="55" height="50">
                                United States
                            </p>
                        </span>
                    <div id="tabpanel1" aria-labelledby="btnSearch0" class="tabOne" role="tabpanel" aria-hidden="false">
                        <div class="form-group">
                            <label for="job">Job</label>
                            <select name="function" id="job" class="form-control jobUs">
                                <option value="" name="Job"></option>
                                <option value="200000021" name="Accounting / Finance">Accounting / Finance</option>
                                <option value="200000040" name="Administrative / Clerical">Administrative / Clerical</option>
                                <option value="200000041" name="Branch Banking">Branch Banking</option>
                                <option value="8240020270" name="Branch Banking - Teller">Branch Banking - Teller</option>
                                <option value="8140020270" name="Business Ops Analysis">Business Ops Analysis</option>
                                <option value="10140020270" name="Campus">Campus</option>
                                <option value="8340020270" name="Collections">Collections</option>
                                <option value="200000043" name="Credit / Lending">Credit / Lending</option>
                                <option value="8440020270" name="Credit Underwriting">Credit Underwriting</option>
                                <option value="200000022" name="Customer Service / Call Center">Customer Service / Call Center</option>
                                <option value="200000023" name="Executive">Executive</option>
                                <option value="200000029" name="Facilities">Facilities</option>
                                <option value="200000000" name="Human Resources">Human Resources</option>
                                <option value="200000026" name="Information Technology">Information Technology</option>
                                <option value="200000027" name="Investments / Insurance">Investments / Insurance</option>
                                <option value="200000028" name="Legal">Legal</option>
                                <option value="200000024" name="Marketing / Communications">Marketing / Communications</option>
                                <option value="200000044" name="Operations">Operations</option>
                                <option value="8540020270" name="Portfolio / Asset Management">Portfolio / Asset Management</option>
                                <option value="8640020270" name="Processing">Processing</option>
                                <option value="200000045" name="Product Management">Product Management</option>
                                <option value="200000046" name="Project Management / Analysis">Project Management / Analysis</option>
                                <option value="200000047" name="Relationship Management">Relationship Management</option>
                                <option value="8740020270" name="Relationship Support">Relationship Support</option>
                                <option value="200000048" name="Risk/Compliance/QC/Audit/Fraud">Risk/Compliance/QC/Audit/Fraud</option>
                                <option value="200000025" name="Sales">Sales</option>
                                <option value="8840020270" name="Sales Support">Sales Support</option>
                                <option value="8940020270" name="Specialized">Specialized</option>
                                <option value="200000050" name="Training">Training</option>
                            </select>
                        </div>

                        <div class="form-group">
                            <label for="location" class="locationUsLabel">Location</label>
                            <select name="state" id="location" class="form-control usLocations">
                                <option value="" name="Location"></option>
                                <option value="200000121" name="Alabama">Alabama</option>
                                <option value="200000120" name="Alaska">Alaska</option>
                                <option value="200000123" name="Arizona">Arizona</option>
                                <option value="200000122" name="Arkansas">Arkansas</option>
                                <option value="200001039" name="California">California</option>
                                <option value="200000125" name="Colorado">Colorado</option>
                                <option value="200000126" name="Connecticut">Connecticut</option>
                                <option value="200000128" name="Delaware">Delaware</option>
                                <option value="200000127" name="District of Columbia">District of Columbia</option>
                                <option value="200000129" name="Florida">Florida</option>
                                <option value="200000130" name="Georgia">Georgia</option>
                                <option value="200000131" name="Hawaii">Hawaii</option>
                                <option value="200000133" name="Idaho">Idaho</option>
                                <option value="200000023" name="Illinois">Illinois</option>
                                <option value="200000134" name="Indiana">Indiana</option>
                                <option value="200000132" name="Iowa">Iowa</option>
                                <option value="200000135" name="Kansas">Kansas</option>
                                <option value="200000136" name="Kentucky">Kentucky</option>
                                <option value="200000137" name="Louisiana">Louisiana</option>
                                <option value="200000141" name="Maine">Maine</option>
                                <option value="200000140" name="Maryland">Maryland</option>
                                <option value="200000138" name="Massachusetts">Massachusetts</option>
                                <option value="200000142" name="Michigan">Michigan</option>
                                <option value="200000001" name="Minnesota">Minnesota</option>
                                <option value="200000145" name="Mississippi">Mississippi</option>
                                <option value="200000144" name="Missouri">Missouri</option>
                                <option value="200000146" name="Montana">Montana</option>
                                <option value="200000150" name="Nebraska">Nebraska</option>
                                <option value="200000158" name="Nevada">Nevada</option>
                                <option value="200000152" name="New Hampshire">New Hampshire</option>
                                <option value="200000153" name="New Jersey">New Jersey</option>
                                <option value="200000154" name="New Mexico">New Mexico</option>
                                <option value="200000159" name="New York">New York</option>
                                <option value="200000148" name="North Carolina">North Carolina</option>
                                <option value="200000149" name="North Dakota">North Dakota</option>
                                <option value="200000160" name="Ohio">Ohio</option>
                                <option value="200000161" name="Oklahoma">Oklahoma</option>
                                <option value="200000163" name="Oregon">Oregon</option>
                                <option value="200000164" name="Pennsylvania">Pennsylvania</option>
                                <option value="228140020270" name="Puerto Rico">Puerto Rico</option>
                                <option value="200000167" name="Rhode Island">Rhode Island</option>
                                <option value="200000168" name="South Carolina">South Carolina</option>
                                <option value="200000169" name="South Dakota">South Dakota</option>
                                <option value="200000171" name="Tennessee">Tennessee</option>
                                <option value="200000172" name="Texas">Texas</option>
                                <option value="200000173" name="Utah">Utah</option>
                                <option value="200000175" name="Vermont">Vermont</option>
                                <option value="200000174" name="Virginia">Virginia</option>
                                <option value="200000176" name="Washington">Washington</option>
                                <option value="200000178" name="West Virginia">West Virginia</option>
                                <option value="200000177" name="Wisconsin">Wisconsin</option>
                                <option value="200000179" name="Wyoming">Wyoming</option>
                            </select>
                        </div>

                        <div class="form-group">
                            <label for="searchKeywordText">Keywords</label><br>
                            <input type="text" name="q" id="searchKeywordText" class="form-control keywordUs"/>
                        </div>
                        <button type="submit" class="form-control search">Search</button>
                        <div class="form-group">
                             <span class="navy_schememap_svg">
                                  <a class="map" href="#">
                                      <img src = "{{asset('images/iconfinder_map-pin-marker-circle.png')}}" width="35" height="35">
                                      <p>See map view</p>
                                  </a>
                             </span>
                        </div>
                    </div>
                    </form>
                <!-- search ends-->

                </div>
                </div>
            </div>
    </section>

    <section class = "content col-xs-12 col-md-12">
        <div class = "container">
            <div class = "row">
                <div class="col-xs-1 col-md-1"></div>
                <div class = "start col-xs-10 col-md-10">
                    <h2 >Careers at OnlineBanking</h2>
                    <p >Looking for more than just a job? Want to make a difference where you live and work?
                    Explore what's possible with a career at OnlineBanking. At OnlineBanking, you'll get
                    the incentives, tools, resources and personal support you need to pursue your professional
                    dreams and cultivate meaningful relationships with the people and communities you support.</p>
                </div>
                <div class="col-xs-1 col-md-1"></div>
            </div>
        </div>
        <div class = "container">
            <div class = "row body">
                <div class="col-xs-3 col-md-3">
                    <h3>Who we are</h3>
                    <h4>Our people</h4>
                    <p>We're not your typical bankers. Meet some of your new colleagues.<br/>
                    <a href="#">Learn more about our people</a></p>
                    <h4 style="margin-top: 2rem">What we do</h4>
                    <p>Our employees are empowered to create change and drive our future.<br />
                        <a href="#">Learn more about what we do</a></p>
                </div>
                <div class="col-xs-1 col-md-1"></div>
                <div class="col-xs-4 col-md-4">
                    <h3>What we offer</h3>
                    <h4>Our benefits</h4>
                    <p>You'll be able to take care of yourself and your family with OnlineBanking benefits.<br />
                    <a href="#">Learn more about our benefits</a></p>
                    <h4 style="margin-top: 2rem">Disability accommodations</h4>
                    <p>We're here to help. Let us know how we can make your application process easier.<br />
                    <a href="#">Learn more about disability accommodations</a></p>

                </div>
                <div class="col-xs-1 col-md-1"></div>
                <div class="col-xs-3 col-md-3">
                    <h3>Connect with us</h3>
                    <h4>Join our talent community</h4>
                    <p>Not ready to apply? Share your contact information with us to stay in touch.<br />
                    <a href="#">Join our talent community</a></p>

                </div>
            </div>
        </div>
    </section>
    <section class="end col-xs-12 col-md-12">
        <div class = "container">
            <div class = "row">
                <div class="col-xs-1 col-md-1"></div>
                <div class="col-xs-4 col-md-4">
                    <h4>Students</h4>
                    <p>Interns at OnlineBanking gain hands-on experience doing meaningful work
                        that affects our bottom line. Explore opportunities for students.<br />
                    </p>
                    <p><a href="#"><div class="red-circular-arrow-icon block-center"> </div></a></p>

                </div>
                <div class="col-xs-2 col-md-2"></div>
                <div class="col-xs-4 col-md-4">
                    <h4>Veterans<br />
                    </h4>
                    <p>Active duty military and veteran candidates have the skills to succeed in
                        a career at OnlineBanking. Learn more about what we offer you and your family.<br />
                    </p>
                    <p ><a href="#"><div class="red-circular-arrow-icon"> </div></a></p>

                </div>
                <div class="col-xs-1 col-md-1"></div>
            </div>
        </div>
    </section>
@endsection