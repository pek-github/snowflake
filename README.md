# snowflake

A Clojure web-service implementing Twitter's Snowflake mechanism for generating unique ID numbers across at high scale.

Visit "Twitter, Inc." here:
https://twitter.com/

Read about Snowflake here:
https://blog.twitter.com/2010/announcing-snowflake

Get Snowflake and play with it (implemented in Scala) here:
https://github.com/twitter/snowflake

This small project was implemented for fun, during a very hot summer day, when I needed to imagine something cool to handle the heat.

## Usage

Run using:
  lein ring server <PORT>
Example:
  lein ring server 4444

## License

Obviously, the mechanism and algorithm is a product of Twitter, Inc. and their licenses about those still holds.
Enjoy and respect their work.

About the Clojure source code:

Copyright 2016 pek,

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
