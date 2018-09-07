var stringForConsole = "what ya doin";
console.log(stringForConsole);

var context = {
    title: "Title is here",
    body: "Body is here"
};

var html = Handlebars.templates.test(context);

console.log(html);