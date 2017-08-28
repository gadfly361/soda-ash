(ns soda-ash.macros)


(def semantic-ui-react-tags
  '[Accordion
    AccordionContent
    AccordionTitle
    Advertisement
    Breadcrumb
    BreadcrumbDivider
    BreadcrumbSection
    Button
    ButtonContent
    ButtonGroup
    ButtonOr
    Card
    CardContent
    CardDescription
    CardGroup
    CardHeader
    CardMeta
    Checkbox
    Comment ;; use as CommentSA
    CommentAction
    CommentActions
    CommentAuthor
    CommentAvatar
    CommentContent
    CommentGroup
    CommentMetadata
    CommentText
    Confirm
    Container
    Dimmer
    DimmerDimmable
    Divider
    Dropdown
    DropdownDivider
    DropdownHeader
    DropdownItem
    DropdownMenu
    DropdownSearchInput
    Embed
    Feed
    FeedContent
    FeedDate
    FeedEvent
    FeedExtra
    FeedLabel
    FeedLike
    FeedMeta
    FeedSummary
    FeedUser
    Flag
    Form
    FormButton
    FormCheckbox
    FormDropdown
    FormField
    FormGroup
    FormInput
    FormRadio
    FormSelect
    FormTextArea
    Grid
    GridColumn
    GridRow
    Header
    HeaderContent
    HeaderSubheader
    Icon
    IconGroup
    Image
    ImageGroup
    Input
    Item
    ItemContent
    ItemDescription
    ItemExtra
    ItemGroup
    ItemHeader
    ItemImage
    ItemMeta
    Label
    LabelDetail
    LabelGroup
    List ;; use as ListSA
    ListContent
    ListDescription
    ListHeader
    ListIcon
    ListItem
    ListList
    Loader
    Menu
    MenuHeader
    MenuItem
    MenuMenu
    Message
    MessageContent
    MessageHeader
    MessageItem
    MessageList
    Modal
    ModalActions
    ModalContent
    ModalDescription
    ModalHeader
    Popup
    PopupContent
    PopupHeader
    Portal
    Progress
    Radio
    Rail
    Rating
    RatingIcon
    Reveal
    RevealContent
    Search
    SearchCategory
    SearchResult
    SearchResults
    Segment
    SegmentGroup
    Select
    Sidebar
    SidebarPushable
    SidebarPusher
    Statistic
    StatisticGroup
    StatisticLabel
    StatisticValue
    Step
    StepContent
    StepDescription
    StepGroup
    StepTitle
    Sticky
    Tab
    Table
    TableBody
    TableCell
    TableFooter
    TableHeader
    TableHeaderCell
    TableRow
    TextArea
    Transition
    Visibility])


(def reserved-tags #{"Comment"
                     "List"})


(defn create-semantic-ui-react-component [tag]
  (let [tag-name (if (reserved-tags (name tag))
                   (-> tag name (str "SA") symbol)
                   tag)]
    `(def ~tag-name (reagent.core/adapt-react-class
                     (aget js/semanticUIReact ~(name tag))))))


(defmacro export-semantic-ui-react-components []
  `(do ~@(map create-semantic-ui-react-component
              semantic-ui-react-tags)))
